interface A { //상속받기 -> interface는 open 내장됨
	fun a()
	
}

interface B {
	
	fun b()
}

open class C{
		open fun c()
	{
		println("C:c() call...")
	}
}

open class D {
	fun d(){
		println("D:d()..call..")
	}
}

//:A =>interface 상속 , A() => class 상속
//형식 C++, 개념 JAVA
//클래스는 단일상속, 인터페이스는 다중상속..
class E:C(),A,B{
	
	override fun c() {
		println("E:c() call..")
	}
	
	override fun a() {
		println("E:a() call..")
	}

	override fun b() {
		println("E:b() call..")
	}
}

fun main(args: Array<String>) {
	var e=E()
	e.c()
	e.a()
	e.b()
}