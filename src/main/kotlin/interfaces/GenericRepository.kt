package interfaces

class GenericRepository<T>:Repository<T> {
    override fun getById(id: Int): T {
                throw UnsupportedOperationException("eception")
    }

    override fun getAll(): List<T> {
        throw UnsupportedOperationException("eception")
    }
}


interface Repo{

    fun <EntityType>getById(id: Int):EntityType
    fun <R>getAll():List<R>
}

class MyRepo:Repo{
    override fun <T> getById(id: Int): T {
        throw UnsupportedOperationException("uNSUPPORTED EXCPETION")
    }

    override fun <T> getAll(): T {
        throw UnsupportedOperationException("unsupportred")
    }
}

