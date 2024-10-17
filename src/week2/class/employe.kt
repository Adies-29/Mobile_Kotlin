package week2.`class`

open class employe (val name : String){
    fun sayHELLO(name: String){
        println("Hello $name my name is ${this.name}")
    }
}

class  manager (name: String): employe(name)

class  member (name: String): employe(name)


