package behavioral.iterator

fun main(){
    var nameRepository = NameRepository()

    var iter : Iterator = nameRepository.getIterator()
    do{
        var name = iter.next()
        println("Name : $name")
    }while (iter.hasNext())
}