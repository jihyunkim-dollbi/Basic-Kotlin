interface A { //��ӹޱ� -> interface�� open �����
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

//:A =>interface ��� , A() => class ���
//���� C++, ���� JAVA
//Ŭ������ ���ϻ��, �������̽��� ���߻��..
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