class Animal {
    String name
    Person owner
}

class Person {
    String name
    int age
    def pets = []

    void addFruit(String fruit) {
        fruits.add(fruit)
    }

    boolean hasMajority() {
        if(age>18){
            return true
        }
        else {
            return false
        }
    }
}

class Cat extends Animal{
int meowPerHour
}

class Dog extends Animal{
    int ouafPerHour
}

def saskia = new Person(name: "saskia",age:12 )

def chamalo = new Cat(name: "chamalo",owner:saskia,meowPerHour: 10)

def lois = new Person(name: "lois",age:9)

def nuage = new Cat(name: "nuage",owner:lois,meowPerHour: 30)

def math = new Person(name: "mathilde",age: 40)

def seb = new Person(name:"sebastien",age: 39)

def tom = new Person(name:"thomas",age: 38 )

def gulli = new Dog(name: "gulli",owner:tom,ouafPerHour: 2 )

def BlancPaul = [saskia,lois,math,seb,chamalo,nuage]

println "Hello my name is ${saskia.name} and they are my family:${BlancPaul.name} "

println saskia.hasMajority()
saskia.addFruit("apple")
saskia.addFruit("banana")
saskia.fruits.each {println it}
