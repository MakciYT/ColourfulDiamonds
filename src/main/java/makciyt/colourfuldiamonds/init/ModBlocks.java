package makciyt.colourfuldiamonds.init;


import makciyt.colourfuldiamonds.ColourfulDiamonds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    //Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColourfulDiamonds.MOD_ID);

    public static final RegistryObject<Block> RED_DIAMOND_BLOCK = BLOCKS.register("red_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> RED_DIAMOND_ORE = BLOCKS.register("red_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.STONE)
                    .setRequiresTool()));



    public static final RegistryObject<Block> GREEN_DIAMOND_BLOCK = BLOCKS.register("green_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> GREEN_DIAMOND_ORE = BLOCKS.register("green_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));



    public static final RegistryObject<Block> BLACK_DIAMOND_BLOCK = BLOCKS.register("black_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BLACK_DIAMOND_ORE = BLOCKS.register("black_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));



    public static final RegistryObject<Block> BROWN_DIAMOND_BLOCK = BLOCKS.register("brown_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BROWN_DIAMOND_ORE = BLOCKS.register("brown_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));



    public static final RegistryObject<Block> YELLOW_DIAMOND_BLOCK = BLOCKS.register("yellow_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> YELLOW_DIAMOND_ORE = BLOCKS.register("yellow_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));



    public static final RegistryObject<Block> BLUE_DIAMOND_BLOCK = BLOCKS.register("blue_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BLUE_DIAMOND_ORE = BLOCKS.register("blue_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));



    public static final RegistryObject<Block> PINK_DIAMOND_BLOCK = BLOCKS.register("pink_diamond_block", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> PINK_DIAMOND_ORE = BLOCKS.register("pink_diamond_ore", () ->
            new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 10f)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

}
