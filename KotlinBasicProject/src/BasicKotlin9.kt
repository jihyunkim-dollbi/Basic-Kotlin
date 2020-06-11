interface Runable{ //자동open
	fun run() //인터페이스 만들기
	
	//default함수
	//필요한 클래스에서만 가져가서 쓰도록 여기서 미리 구현해놓은것!
	fun test(){
		println("Runable test().. call") //먼저구현을 해놓고
	}
}

class Human:Runable{
	override fun run()
	{
		println("Human:run() call") // override한 곳에서 가져가서 재정의
	}
}
class Human2:Runable{
	override fun run(){
	println("Human2:run() call")
	}
}
fun main(args: Array<String>) {
	var h=Human() //메모리할당
	h.run()
	//Human:run() call
	h.test()
	//Runable test().. call
}