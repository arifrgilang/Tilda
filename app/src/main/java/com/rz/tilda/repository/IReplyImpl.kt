package com.rz.tilda.repository

class IReplyImpl: IReply {
    var outText = mutableListOf<String>(
        "Morning Buddy , How are you ?",
        "do you have some plan for today ?",
        "don’t forget eat some breakfast and drink some drink , so you don’t sick",
        "What time are you coming home ?",
        "Okay be Carefull"
    )

    override fun getLowResponse(pos: Int) = outText[pos]
}