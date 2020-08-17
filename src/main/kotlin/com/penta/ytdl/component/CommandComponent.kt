package com.penta.ytdl.component

import com.penta.ytdl.model.Command
import com.penta.ytdl.module.CommandModule
import dagger.BindsInstance
import dagger.Subcomponent
import java.io.File

@Subcomponent(modules = [CommandModule::class])
interface CommandComponent {

    fun getCommand(): Command

    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance commandStr: String, @BindsInstance destination: File): CommandComponent
    }
}