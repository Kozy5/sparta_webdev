package study1.study1.blog.repository

import org.springframework.data.repository.CrudRepository
import study1.study1.blog.entity.Wordcount

interface Wordrepository : CrudRepository<Wordcount, String>