import java.util.*

fun main(args: Array<String>) {
	
	//whileTest2()
	dowhileTest()
}

fun whileTest()
{
	var i=1
	while(i<10)
	{
		println("i=$i")
		i++;
	}
}

fun whileTest2()
{ 
	var scan=Scanner(System.`in`) //생성자호출 // in 키워드 사용중
	print("정수입력:")
	var j=scan.nextInt()
	var i=1
	while(i<=9)
	{
		println("$j * $i = "+(i*j))
		i++
	}
	
}

fun dowhileTest()
{
	var i=1
	do{
		println("i=$i")
		i++
	}while(i<=10)
}
