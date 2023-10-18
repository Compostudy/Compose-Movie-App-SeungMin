package com.example.domain.usecase

import com.example.domain.model.MovieCover
import com.example.domain.repository.MovieRepository
import javax.inject.Inject

class GetSimilarUseCase @Inject constructor(
    private val repository: MovieRepository
) {

    suspend operator fun invoke(id:Int): List<MovieCover> {
       return repository.getSimilar(id)
    }
}