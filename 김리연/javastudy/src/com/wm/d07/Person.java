package com.wm.d07;

public class Person {}
// 제네릭이란 결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는기능

class Worker extends Person {}

class Student extends Person {}

class HighStudent extends Student {}

class MiddleStudent extends Student {}