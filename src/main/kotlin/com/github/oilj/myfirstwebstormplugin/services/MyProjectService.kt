package com.github.oilj.myfirstwebstormplugin.services

import com.intellij.openapi.project.Project
import com.github.oilj.myfirstwebstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
