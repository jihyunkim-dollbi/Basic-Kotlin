/*
 	상속을 내리는 클래스 ==> open class
 	=> 상속을 받아서 함수를 재정의 가능 => open해야 상속/재정의 가능
 
 
 
 */
open class Saram{       //상속을 내리는 클래스는 open명시하기
	var name:String=""
	var sex:String=""
	var addr:String=""

	open fun myData() //다른곳에서 사용하게 하려면 open주기
	{
		println("Saram:myData() call..")
	}
}

class Member:Saram()
{
	fun dataPrint() //멤버 변수는 --- 파란 밑줄이 그어진다
	{
		name="홍길동" //위에서 상속받아 값 주입
		sex="남자"
		addr="서울"
	}
	override fun myData() //재정의 => open된것만 재정의하여 사용가능
	{
		println("Member:myData() call..")
	}
}

fun main(args: Array<String>) {
	
	var mem:Member=Member(); //객체생성
	mem.dataPrint()//상속 연결
	println(mem.name)
	println(mem.sex)
	println(mem.addr)
	mem.myData()
}


