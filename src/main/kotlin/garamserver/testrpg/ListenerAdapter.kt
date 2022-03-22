package garamserver.testrpg

import net.kyori.adventure.text.Component
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeModifier
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemFlag

class ListenerAdapter : Listener {
    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        val playerItem = event.player.inventory.itemInMainHand

        fun updateDamage() {
            if (playerItem.type == Material.IRON_SWORD)
                if (playerItem.itemMeta.customModelData == 1) {
                    val meta = playerItem.itemMeta
                    meta.addItemFlags(
                        ItemFlag.HIDE_ATTRIBUTES
                    )
                    meta.lore(
                        listOf(
                            Component.text("${ChatColor.AQUA}가벼운 속성이 부여된 검"),
                            Component.text("${ChatColor.AQUA}모험을 떠나 ${ChatColor.RED}불의 토템 ${ChatColor.AQUA}을 얻어 강화할수 있다."),
                            Component.text("${ChatColor.BLUE}공격력 : 20")
                        )
                    )
                    meta.addAttributeModifier(
                        Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(
                            "generic.attackDamage",
                            20.0, AttributeModifier.Operation.ADD_NUMBER
                        )
                    )
                    playerItem.itemMeta = meta
                }
            if (playerItem.type == Material.IRON_SWORD)
                if (playerItem.itemMeta.customModelData == 2) {
                    val meta = playerItem.itemMeta
                    meta.addItemFlags(
                        ItemFlag.HIDE_ATTRIBUTES
                    )
                    meta.lore(
                        listOf(
                            Component.text("${ChatColor.AQUA}강화를 통해 화력이 매우 강해졌다."),
                            Component.text("${ChatColor.AQUA}희귀한 강화 재료 ${ChatColor.RED}불의 수정 ${ChatColor.AQUA}을 얻어 강화할 수 있다."),
                            Component.text("${ChatColor.BLUE}공격력 : 35")
                        )
                    )
                    meta.addAttributeModifier(
                        Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(
                            "generic.attackDamage",
                            35.0, AttributeModifier.Operation.ADD_NUMBER
                        )
                    )
                    playerItem.itemMeta = meta
                }
            if (playerItem.type == Material.IRON_SWORD)
                if (playerItem.itemMeta.customModelData == 3) {
                    val meta = playerItem.itemMeta
                    meta.addItemFlags(
                        ItemFlag.HIDE_ATTRIBUTES
                    )
                    meta.lore(
                        listOf(
                            Component.text("${ChatColor.AQUA}불속성 최고의 검."),
                            Component.text("${ChatColor.AQUA}더이상 강화가 불가능하다.  ${ChatColor.RED}신${ChatColor.AQUA}의 경지에 오른 자는 유일 화속성 검을 얻을수 있다."),
                            Component.text("${ChatColor.BLUE}공격력 : 60")
                        )
                    )
                    meta.addAttributeModifier(
                        Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(
                            "generic.attackDamage",
                            60.0, AttributeModifier.Operation.ADD_NUMBER
                        )
                    )
                    playerItem.itemMeta = meta
                }
            if (playerItem.type == Material.IRON_SWORD)
                if (playerItem.itemMeta.customModelData == 4) {
                    val meta = playerItem.itemMeta
                    meta.addItemFlags(
                        ItemFlag.HIDE_ATTRIBUTES
                    )
                    meta.lore(
                        listOf(
                            Component.text("${ChatColor.AQUA}가벼운 속성이 부여된 검"),
                            Component.text("${ChatColor.AQUA}모험을 떠나  ${ChatColor.BLUE}얼음의 토템${ChatColor.AQUA}을 얻어 강화할 수 있다."),
                            Component.text("${ChatColor.BLUE}공격력 : 20")
                        )
                    )
                    meta.addAttributeModifier(
                        Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(
                            "generic.attackDamage",
                            20.0, AttributeModifier.Operation.ADD_NUMBER
                        )
                    )
                    playerItem.itemMeta = meta
                }
            if (playerItem.type == Material.IRON_SWORD)
                if (playerItem.itemMeta.customModelData == 5) {
                    val meta = playerItem.itemMeta
                    meta.addItemFlags(
                        ItemFlag.HIDE_ATTRIBUTES
                    )
                    meta.lore(
                        listOf(
                            Component.text("${ChatColor.AQUA}강화를 통해 한기가 매우 강해졌다."),
                            Component.text("${ChatColor.AQUA}희귀한 강화 재료 ${ChatColor.BLUE}얼음의 수정 ${ChatColor.AQUA}을 얻어 강화할 수 있다."),
                            Component.text("${ChatColor.BLUE}공격력 : 35")
                        )
                    )
                    meta.addAttributeModifier(
                        Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(
                            "generic.attackDamage",
                            35.0, AttributeModifier.Operation.ADD_NUMBER
                        )
                    )
                    playerItem.itemMeta = meta
                }
            if (playerItem.type == Material.IRON_SWORD)
                if (playerItem.itemMeta.customModelData == 6) {
                    val meta = playerItem.itemMeta
                    meta.addItemFlags(
                        ItemFlag.HIDE_ATTRIBUTES
                    )
                    meta.lore(
                        listOf(
                            Component.text("${ChatColor.AQUA}얼음속성 최고의 검."),
                            Component.text("${ChatColor.AQUA}더이상 강화가 불가능하다.  ${ChatColor.BLUE}신${ChatColor.AQUA}의 경지에 오른 자는 유일 빙속성 검을 얻을수 있다."),
                            Component.text("${ChatColor.BLUE}공격력 : 60")
                        )
                    )
                    meta.addAttributeModifier(
                        Attribute.GENERIC_ATTACK_DAMAGE, AttributeModifier(
                            "generic.attackDamage",
                            60.0, AttributeModifier.Operation.ADD_NUMBER
                        )
                    )
                    playerItem.itemMeta = meta
                }
        }
        updateDamage()
    }
}