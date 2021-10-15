package com.github.timonind.mvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.timonind.mvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
