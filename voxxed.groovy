class Animal {
    String name
    int age
}

class Cat extends Animal {
    int meowPerHour

    void talk(){
        println "Hello my name is ${name} I am ${age} and I do ${meowPerHour} meow per hour !"
    }
}

class Garden {
    def cats = []
}

def nuage = new Cat(name: "Nuage",age: 3, meowPerHour: 7)
def chamalo = new Cat(name:"Chamalo", age: 3, meowPerHour: 14)

def garden = new Garden()
garden.cats << nuage
garden.cats << chamalo

println "In the garden there are ${garden.cats.size()} cats !"
garden.cats.each {cat -> cat.talk()}

