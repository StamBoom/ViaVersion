package us.myles.ViaVersion.protocols.protocol1_9_1_2to1_9_3_4.chunks;

import com.github.steveice10.opennbt.tag.builtin.CompoundTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import us.myles.ViaVersion.api.minecraft.chunks.Chunk;

import java.util.List;

@Data
@AllArgsConstructor
public class Chunk1_9_3_4 implements Chunk {
    private int x;
    private int z;
    private boolean groundUp;
    private int bitmask;
    private ChunkSection1_9_3_4[] sections;
    private byte[] biomeData;
    private List<CompoundTag> blockEntities;

    @Override
    public boolean isBiomeData() {
        return biomeData != null;
    }
}
