package com.example.trivia_jan10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trivia_jan10.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    private var _binding: FragmentQuestionBinding? = null
    private val binding: FragmentQuestionBinding get() = _binding!!

    private val viewModel: TriviaViewModel by activityViewModels()
    private lateinit var adapter: AnswerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = AnswerAdapter(this::onAnswerSelected)
        with(binding) {
            viewModel.currentQuestion.observe(viewLifecycleOwner) { question ->
                if (question == null) return@observe
                questionTv.text = question.question
                adapter.submitAnswers(question.answers)

                //trying to get recyclerView to show answers
                //questionRv.

                /*
               userRv.apply {
                    adapter = UserAdapter(users)
                    // Tells reyclerview orientation
                    layoutManager =
                        LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                }
                 */
                //still crashing. can't get the proper context to work
                //questionRv.adapter = AnswerAdapter()
//                questionRv.layoutManager = LinearLayoutManager(requireParentFragment().context, LinearLayoutManager.VERTICAL, false)
            }
            viewModel.isGameOver.observe(viewLifecycleOwner) { shouldNavigate ->
                if (shouldNavigate) {
                    // TODO: implement navigation logic
                    val action = QuestionFragmentDirections.actionQuestionFragmentToEndGameFragment()
                    findNavController().navigate(action)
                }
            }
        }
    }

    private fun onAnswerSelected(answer: Answer) {
        viewModel.onQuestionAnswered(answer)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}