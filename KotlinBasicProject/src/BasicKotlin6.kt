import java.util.*
/*
 함수
 =리턴형 있는 경우
 fun 함수평(매개변수...):데이터형{}  ==> ():Int, ():String, ():Array(배열리턴)	
 
 =리턴형 없는 경우
 fun 함수평(매개변수...){} ==> void

 */
fun main(args: Array<String>) {
	
	var temp=((Math.random()*100)+1).toInt()
	var com=temp.toInt() //형변환
	println("temp=$temp")
	println("com=$com")
	
    //toDouble() , toString(), toInt
	
	var scan=Scanner(System.`in`)
	while(true)
	{
		print("1에서 100까지 정수를 입력:")
		var i=scan.nextInt()
		if(i<0 || i>100)
		{
			println("1~100까지 사이의 정수를 입력하세요")
			continue
		}
		
		if(i<com){
			println("입력값보다 큰값을 입력하세요")
			
		}else if(i>com){
				println("입력값보다 작은 값을 입력하세요")
		}else{
			println("Game over!")
			break
		}
			
	}
}

