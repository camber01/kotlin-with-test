package behavioral.iterator

class NameRepository : Container {
    override fun getIterator(): Iterator {
        return NameIterator()
    }

    class NameIterator : Iterator {
        var index:Int = 0
        private val name = arrayOf("Robert", "John", "Julie", "Lora")

        override fun hasNext(): Boolean {
            if (index < name.size){
                return true
            }
            return false
        }

        override fun next(): String? {
            if (this.hasNext()){
                return name[index++]
            }
            return null;
        }

    }
}