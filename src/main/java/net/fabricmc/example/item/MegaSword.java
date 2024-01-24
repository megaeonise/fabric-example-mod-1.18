package net.fabricmc.example.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.fabricmc.example.item.MegaToolMaterial;

public class MegaSword extends SwordItem{
    public MegaSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    
}
