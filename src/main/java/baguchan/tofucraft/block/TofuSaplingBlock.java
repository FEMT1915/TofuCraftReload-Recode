package baguchan.tofucraft.block;

import baguchan.tofucraft.registry.TofuBlocks;
import baguchan.tofucraft.world.gen.grower.TofuTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TofuSaplingBlock extends SaplingBlock {
	public TofuSaplingBlock(TofuTreeGrower tofuTreeGrower, Properties properties) {
		super(tofuTreeGrower, properties);
	}

	@Override
	protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
		return p_51042_.is(TofuBlocks.TOFU_TERRAIN);
	}
}
