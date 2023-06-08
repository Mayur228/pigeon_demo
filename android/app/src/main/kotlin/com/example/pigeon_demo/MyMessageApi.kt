package com.example.pigeon_demo

class MyMessageApi : MessageApi {

    private val message = listOf(
        MyMessage(
            title = "test",
            body = "hello",
            email = "mk@gmail.com"
        ),
        MyMessage(
            title = "test2",
            body = "hello2",
            email = "mk12@gmail.com"
        ),
        MyMessage(
            title = "test3",
            body = "hello3",
            email = "mk123@gmail.com"
        )
    )
    override fun getMessage(fromEmail: String): List<MyMessage> {
        return message.filter { it.email == fromEmail }.toMutableList()
    }

}