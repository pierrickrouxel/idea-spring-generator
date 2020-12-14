package com.github.pierrickrouxel.ideaspringgenerator.services

import com.intellij.openapi.project.Project
import com.github.pierrickrouxel.ideaspringgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
