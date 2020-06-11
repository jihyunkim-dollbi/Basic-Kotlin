fun main(args: Array<String>){
	forTest5()
}

// for문
fun forTest1()
{
	for(i in 1..10)   //10을 포함
		println("i=$i")
}

fun forTest2()
{
	for(i in 1 until(11)) //11이 포함이 안됨
		println("i=$i")
}

fun forTest3()
{
	for(i in 1..10 step 2) //2씩 증가
		println("i=$i")
}

fun forTest4()
{
//	for(i in 10..1) //앞에 수가 뒤보다 커야한다.
	for(i in 10 downTo(1))
		println("i=$i")
}


//자바는 :데이터형 => 코틀린 in !
//forEach => Array
fun forTest5()
{
	var names=arrayOf("홍길동","심청이","춘향이","박문수","김두한") //배열
	for(item in names)
	{	
		println(item)
	}
	
}