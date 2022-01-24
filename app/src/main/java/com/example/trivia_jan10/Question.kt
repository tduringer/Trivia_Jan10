package com.example.trivia_jan10

data class Question(
    val question: String,
    val answers: List<Answer>
)

data class Answer(
    val isCorrect: Boolean,
    val answer: String
)

fun getQuestions(): List<Question> {
    val question1 = Question(
        question = "Who finished?",
        answers = listOf(
            Answer(
                isCorrect = true,
                answer = "No one"
            ),
            Answer(
                isCorrect = false,
                answer = "Everyone"
            ),
            Answer(
                isCorrect = false,
                answer = "Jonathan"
            ),
            Answer(
                isCorrect = false,
                answer = "Terry"
            )
        )
    )
    val question2 = Question(
        question = "Who finished?",
        answers = listOf(
            Answer(
                isCorrect = true,
                answer = "No one"
            ),
            Answer(
                isCorrect = false,
                answer = "Everyone"
            ),
            Answer(
                isCorrect = false,
                answer = "Jonathan"
            ),
            Answer(
                isCorrect = false,
                answer = "Terry"
            )
        )
    )
    val question3 = Question(
        question = "Who finished?",
        answers = listOf(
            Answer(
                isCorrect = true,
                answer = "No one"
            ),
            Answer(
                isCorrect = false,
                answer = "Everyone"
            ),
            Answer(
                isCorrect = false,
                answer = "Jonathan"
            ),
            Answer(
                isCorrect = false,
                answer = "Terry"
            )
        )
    )
    val question4 = Question(
        question = "Who finished?",
        answers = listOf(
            Answer(
                isCorrect = true,
                answer = "No one"
            ),
            Answer(
                isCorrect = false,
                answer = "Everyone"
            ),
            Answer(
                isCorrect = false,
                answer = "Jonathan"
            ),
            Answer(
                isCorrect = false,
                answer = "Terry"
            )
        )
    )
    val question5 = Question(
        question = "Did anyone finish?",
        answers = listOf(
            Answer(
                isCorrect = true,
                answer = "true"
            ),
            Answer(
                isCorrect = false,
                answer = "false"
            )
        )
    )
    return listOf(question1, question2, question3, question4, question5)
}