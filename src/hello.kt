fun main() {
    // Classes

//    class Dog(var name: String, var age:Int){
//    }



//    class Dog{
//
//        var name: String
//        var age : Int
//
//        init{
//            name = ""
//            age  = 0
//            }
//    }

    class Dog{

        var name : String
        var age : Int
        var fur : String

        constructor(name: String,age: Int, fur: String)  {

            this.name = name
            this.age = age
            this.fur = fur
        }
        constructor(){
            name = ""
            age  = 0
            fur  = ""
        }
        fun dogInfo(){
            println("$name is $age years old and his fur is $fur")
        }
    }
    var myDog = Dog("Nina", 14, "brown")
    var myDogo  = Dog()

    myDog.dogInfo()
    myDogo.dogInfo()
}