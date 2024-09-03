package com.github.sdipendra.angularintellijcommunity.services

import com.intellij.openapi.project.Project
import com.github.sdipendra.angularintellijcommunity.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
