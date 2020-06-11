class AA //선언만 하지않고 초기값을 주어야한다. //null값 처리
{
	val b:String?=null //스트링에대한 초기값을 줄때 형식!
	val a:String=""
	val c:BB?=null //클래스 객체 초기화

}
class BB
{
	
	
}

fun main(args:Array<String>)
{
	val foods:List<String> = listOf("사과","배","수박") // >다음에  = 과 한칸 띄기
	for(f in foods){
		println("1"+f)
	}
	// :List<String> => 데이터형 생략 가능
	val foods2=mutableListOf("밥","국","라면")
	foods2.add("떡")
	foods2.removeAt(0)
	foods2[1]="생선"
	for(f in foods2)
		{
			println("2"+f)
		}
}

// 1 2 3 4 5 6 7 8 9 0
