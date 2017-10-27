package de.luckycrew.halloween.item;

import static de.luckycrew.halloween.tab.HalloweenTabs.tab;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class HalloweenItems {
	
	public static ArmorMaterial scarecrow_material;
	public static ArmorMaterial slender_material;
	
	public static ToolMaterial killerknive_material;
	
	public static Item candy, teleporter;
	
	public static ItemArmorBase[] scarecrow, slender;
	
	public static Item killerknive;
	
	public HalloweenItems() {
		amormaterial();
		toolmaterial();
		item();
	}
	
	private void amormaterial() {
		scarecrow_material = EnumHelper.addArmorMaterial("scarecrow", "", 200, new int[] { 3, 8, 6, 3 }, 20);
		slender_material = EnumHelper.addArmorMaterial("slender", "", 200, new int[] { 6, 16, 12, 6 }, 20);
	}
	
	private void toolmaterial() {
		killerknive_material = EnumHelper.addToolMaterial("killerknive", 1, 120, 1, 7, 20);
	}
	
	private void item() {
		candy = new ItemCandy("candy", tab);
		teleporter = new ItemTeleporter("teleporter", tab);
		armor();
		tool();
	}
	
	private void armor() {
		scarecrow = createArmor(scarecrow_material, "scarecrow");
		slender = createArmor(slender_material, "slender");
	}
	
	private void tool() {
		killerknive = new ItemKillerKnive(killerknive_material, "killerknive", tab);
	}
	
	// Methods
	private String[] armor = new String[] { "helmet", "chestplate", "leggings", "boots" };
	
	private ItemArmorBase[] createArmor(ArmorMaterial material, String name) {
		ItemArmorBase[] basearmor = new ItemArmorBase[4];
		
		for (int i = 0; i < basearmor.length; i++) {
			basearmor[i] = new ItemArmorBase(material, i, name, armor[i], tab);
		}
		return basearmor;
	}
	
}
