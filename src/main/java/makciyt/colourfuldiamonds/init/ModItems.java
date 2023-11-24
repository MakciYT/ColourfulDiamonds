package makciyt.colourfuldiamonds.init;

import makciyt.colourfuldiamonds.ColourfulDiamonds;
import makciyt.colourfuldiamonds.items.SpecialItem;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    //Items

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColourfulDiamonds.MOD_ID);

    public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item", () ->
            new SpecialItem(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("red_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> RED_DIAMOND_BLOCK = ITEMS.register("red_diamond_block", () ->
            new BlockItem(ModBlocks.RED_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> RED_DIAMOND_ORE = ITEMS.register("red_diamond_ore", () ->
            new BlockItem(ModBlocks.RED_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> RED_DIAMOND_PICKAXE = ITEMS.register("red_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() { return 1800; }

                public float getEfficiency() { return 8f; }

                public float getAttackDamage() { return 3f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 2; }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> RED_DIAMOND_SWORD = ITEMS.register("red_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() { return 1800; }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 6f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }

            }, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> RED_DIAMOND_AXE = ITEMS.register("red_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1800;
                }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() {
                    return 7f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> RED_DIAMOND_SHOVEL = ITEMS.register("red_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 1800; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> RED_DIAMOND_HOE = ITEMS.register("red_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 1800; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));



    public static final RegistryObject<Item> GREEN_DIAMOND = ITEMS.register("green_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_DIAMOND_BLOCK = ITEMS.register("green_diamond_block", () ->
            new BlockItem(ModBlocks.GREEN_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> GREEN_DIAMOND_ORE = ITEMS.register("green_diamond_ore", () ->
            new BlockItem(ModBlocks.GREEN_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> GREEN_DIAMOND_PICKAXE = ITEMS.register("green_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1600;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> GREEN_DIAMOND_SWORD = ITEMS.register("green_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() {
                    return 1600;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 5f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }
            }, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> GREEN_DIAMOND_AXE = ITEMS.register("green_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1600;
                }

                public float getEfficiency() {
                    return 4f;
                }

                public float getAttackDamage() {
                    return 7f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> GREEN_DIAMOND_SHOVEL = ITEMS.register("green_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 1600; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> GREEN_DIAMOND_HOE = ITEMS.register("green_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 1600; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));



    public static final RegistryObject<Item> BLACK_DIAMOND = ITEMS.register("black_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_DIAMOND_BLOCK = ITEMS.register("black_diamond_block", () ->
            new BlockItem(ModBlocks.BLACK_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> BLACK_DIAMOND_ORE = ITEMS.register("black_diamond_ore", () ->
            new BlockItem(ModBlocks.BLACK_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> BLACK_DIAMOND_PICKAXE = ITEMS.register("black_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 2000;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f,new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> BLACK_DIAMOND_SWORD = ITEMS.register("black_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() {
                    return 2000;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 8f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }
            }, 3, -3f,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> BLACK_DIAMOND_AXE = ITEMS.register("black_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 2000;
                }

                public float getEfficiency() {
                    return 4f;
                }

                public float getAttackDamage() {
                    return 7f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> BLACK_DIAMOND_SHOVEL = ITEMS.register("black_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 2000; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> BLACK_DIAMOND_HOE = ITEMS.register("black_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 2000; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));



    public static final RegistryObject<Item> BROWN_DIAMOND = ITEMS.register("brown_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_DIAMOND_BLOCK = ITEMS.register("brown_diamond_block", () ->
            new BlockItem(ModBlocks.BROWN_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> BROWN_DIAMOND_ORE = ITEMS.register("brown_diamond_ore", () ->
            new BlockItem(ModBlocks.BROWN_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> BROWN_DIAMOND_PICKAXE = ITEMS.register("brown_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1400;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> BROWN_DIAMOND_SWORD = ITEMS.register("brown_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() {
                    return 1400;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }
            }, 3, -2.8f,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> BROWN_DIAMOND_AXE = ITEMS.register("brown_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() { return 1400; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 7f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 2; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> BROWN_DIAMOND_SHOVEL = ITEMS.register("brown_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 1400; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> BROWN_DIAMOND_HOE = ITEMS.register("brown_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 1400; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));



    public static final RegistryObject<Item> YELLOW_DIAMOND = ITEMS.register("yellow_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_DIAMOND_BLOCK = ITEMS.register("yellow_diamond_block", () ->
            new BlockItem(ModBlocks.YELLOW_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> YELLOW_DIAMOND_ORE = ITEMS.register("yellow_diamond_ore", () ->
            new BlockItem(ModBlocks.YELLOW_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> YELLOW_DIAMOND_PICKAXE = ITEMS.register("yellow_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1500;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> YELLOW_DIAMOND_SWORD = ITEMS.register("yellow_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() {
                    return 1500;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }
            }, 3, -2.4f,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> YELLOW_DIAMOND_AXE = ITEMS.register("yellow_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1500;
                }

                public float getEfficiency() {
                    return 4f;
                }

                public float getAttackDamage() {
                    return 7f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> YELLOW_DIAMOND_SHOVEL = ITEMS.register("yellow_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 1500; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> YELLOW_DIAMOND_HOE = ITEMS.register("yellow_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 1500; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));



    public static final RegistryObject<Item> BLUE_DIAMOND = ITEMS.register("blue_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_DIAMOND_BLOCK = ITEMS.register("blue_diamond_block", () ->
            new BlockItem(ModBlocks.BLUE_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> BLUE_DIAMOND_ORE = ITEMS.register("blue_diamond_ore", () ->
            new BlockItem(ModBlocks.BLUE_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> BLUE_DIAMOND_PICKAXE = ITEMS.register("blue_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1700;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> BLUE_DIAMOND_SWORD = ITEMS.register("blue_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() {
                    return 1700;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 6f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }
            }, 3, -2.8f,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> BLUE_DIAMOND_AXE = ITEMS.register("blue_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1700;
                }

                public float getEfficiency() {
                    return 4f;
                }

                public float getAttackDamage() {
                    return 7f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> BLUE_DIAMOND_SHOVEL = ITEMS.register("blue_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 1700; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> BLUE_DIAMOND_HOE = ITEMS.register("blue_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 1700; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));



    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register("pink_diamond", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_DIAMOND_BLOCK = ITEMS.register("pink_diamond_block", () ->
            new BlockItem(ModBlocks.PINK_DIAMOND_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> PINK_DIAMOND_ORE = ITEMS.register("pink_diamond_ore", () ->
            new BlockItem(ModBlocks.PINK_DIAMOND_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<PickaxeItem> PINK_DIAMOND_PICKAXE = ITEMS.register("pink_diamond_pickaxe", () ->
            new PickaxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1550;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 3f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, 0)));

    public static final RegistryObject<SwordItem> PINK_DIAMOND_SWORD = ITEMS.register("pink_diamond_sword", () ->
            new SwordItem(new IItemTier() {
                public int getMaxUses() {
                    return 1550;
                }

                public float getEfficiency() {
                    return 8f;
                }

                public float getAttackDamage() {
                    return 5f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 10;
                }

                public Ingredient getRepairMaterial() {
                    return null;
                }
            }, 3, -2.8f,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<AxeItem> PINK_DIAMOND_AXE = ITEMS.register("pink_diamond_axe", () ->
            new AxeItem(new IItemTier() {
                public int getMaxUses() {
                    return 1550;
                }

                public float getEfficiency() {
                    return 4f;
                }

                public float getAttackDamage() {
                    return 7f;
                }

                public int getHarvestLevel() {
                    return 3;
                }

                public int getEnchantability() {
                    return 2;
                }

                public Ingredient getRepairMaterial() {
                    return Ingredient.EMPTY;
                }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.AXE, 0)));

    public static final RegistryObject<ShovelItem> PINK_DIAMOND_SHOVEL = ITEMS.register("pink_diamond_shovel", () ->
            new ShovelItem(new IItemTier() {
                public int getMaxUses() { return 1550; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return 3.5f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.SHOVEL, 0)));

    public static final RegistryObject<HoeItem> PINK_DIAMOND_HOE = ITEMS.register("pink_diamond_hoe", () ->
            new HoeItem(new IItemTier() {
                public int getMaxUses() { return 1550; }

                public float getEfficiency() { return 4f; }

                public float getAttackDamage() { return -1f; }

                public int getHarvestLevel() { return 3; }

                public int getEnchantability() { return 10; }

                public Ingredient getRepairMaterial() { return Ingredient.EMPTY; }
            }, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS).addToolType(ToolType.HOE, 0)));

}