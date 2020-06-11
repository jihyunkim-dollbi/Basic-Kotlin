//switch => when
fun main(args: Array<String>) {
/*	
	var sex=3
	var s=sexCheck(sex)
	println("s=$s")
	//s=남자
*/
	var i=8
	numberSelect(i) //2와 3을 선택함
	//println("i=$i")
}

fun sexCheck(sex:Int):String{
	var s:String=" "
	when(sex)
	{
		1->s="남자"
		2->s="여자"
		3->s="남자"
		4->s="여자"
	}
	return s
}

fun numberSelect(a:Int)
{
	when(a){
	1->println("1을 선택함")
	2,3->println("2와 3을 선택함")
	in 4..7->println("4~7까지 실행함") //4,5,6,7 //
	8,9->println("8와 9 실행함")
	!in 1..7->println("8,9가 선택됨") //1~7안에 포함이 안되었다면~
		
	}
	
}