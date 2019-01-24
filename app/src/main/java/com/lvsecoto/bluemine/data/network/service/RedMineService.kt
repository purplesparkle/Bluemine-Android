package com.lvsecoto.bluemine.data.network.service

import androidx.lifecycle.LiveData
import com.lvsecoto.bluemine.data.network.ApiResponse
import com.lvsecoto.bluemine.data.network.response.ProjectResponse
import retrofit2.http.GET

interface RedMineService {

    @GET("/projects.json")
    fun getProject() : LiveData<ApiResponse<ProjectResponse>>
}