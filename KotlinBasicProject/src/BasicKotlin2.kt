/*
	코틀린 특성
 	1) 정적 타임 지정 언어 : var a=10.5 => 들어오는 모든 값에 따라 데이터형이 지정됨
 	2) 목적: 간결성, 실용성, 안정성 => 기반(자바JVM)
 	3) 상호운영성 : 자바 lib 사용 가능(has JRE LIB)

 
*/
//import java.util.*;
// if, when(switch), for, while
/*
 	if조건문
 	=if조건
 	=if조건 ~else
	=if조건~else if~ else
 
 */
/*
 	when 
 
 */
fun main(args: Array<String>) {
	
	/*var a=10
	var b=20
	var c=max(a,b)
	println("max=$c")
	//max=20
	
	var d=30
	var e=50
	var k=max1(d,e)
	println("max1=$k")
	//max1=50
*/
	var score=85
	var grade=hakjum(score)
	println("score=$score, grade=$grade 학점")
}

/*
 	fun 함수명(매개변수...) = void 함수명 매개변수
 	fun 함수명(매개변수...):데이터형(리턴형이존재)
 */
fun max(a:Int, b:Int):Int //:Int => Int return , no adding var
{
	var c:Int
	if(a>b)
		c=a
	else
		c=b
	return c
}

//{} 없이 함수만들기 가능 => 함수와 변수를 같은 역할로 취급한다.
fun max1(a:Int, b:Int):Int=if(a>b) a else b
fun max2(a:Int, b:Int)=if(a>b) a else b


fun hakjum(a:Int):Char
{
	var c:Char='A' //초기값
	
	if(a>90)
		c='A'
	else if(a>80)
		c='B'
	else if(a>70)
		c='C'
	else if(a>60)
		c='D'
	else
		c='F'
	
	return c
}













