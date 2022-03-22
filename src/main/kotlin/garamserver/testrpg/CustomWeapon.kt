package garamserver.testrpg

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.plugin.java.JavaPlugin
import java.io.File

lateinit var instance: CustomWeapon

class CustomWeapon : JavaPlugin() {
    private lateinit var userDataFile: File
    lateinit var userData: FileConfiguration

    override fun onEnable() {
        instance = this
        load()
        server.pluginManager.registerEvents(ListenerAdapter(),this)
    }

    override fun onDisable() {
        save()
    }

    fun load() {
        userDataFile = File(dataFolder, "userdata.yml").also {
            if (it.exists()) {
                it.createNewFile()
            }

        }
        userData = YamlConfiguration.loadConfiguration(userDataFile)
    }

    fun save() {
        userData.save(userDataFile)
    }


}
