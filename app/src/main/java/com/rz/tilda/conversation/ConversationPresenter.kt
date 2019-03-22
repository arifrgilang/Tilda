package com.rz.tilda.conversation

import com.rz.tilda.repository.IReply

class ConversationPresenter(val view: ConversationContract.View,
                            val reply: IReply): ConversationContract.Presenter {

    var countDialog = 0

    override fun onSpeech(speech: String) {
        val response = reply.getLowResponse(countDialog);
        view.onReply(response)
        countDialog++
    }
}