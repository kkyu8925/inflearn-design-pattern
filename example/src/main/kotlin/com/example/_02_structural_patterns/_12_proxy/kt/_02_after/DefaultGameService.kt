package com.example._02_structural_patterns._12_proxy.kt._02_after

class DefaultGameService : GameService {

    override fun startGame() {
        println("이 자리에 오신 여러분을 진심으로 환영합니다.")
    }
}
