package com.rz.tilda.conversation

interface ConversationContract {
    interface  View {
        fun onReply(string: String)
    }
    interface Presenter {
        fun onSpeech(speech: String)
    }
}