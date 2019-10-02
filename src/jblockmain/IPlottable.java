package jblockmain;

import java.io.File;
import java.util.ArrayList;

/** Interface required by each pattern to ensure it is compatible with the plotting component. */
public interface IPlottable
{
    /**
     * Get list of X points for each block the pattern contains.
     * @param blockNumber   block number to query.
     * @return              list of keypoints.
     * @throws Exception    if list cannot be provided.
     */
    ArrayList<Double> getXPoints(int blockNumber) throws Exception;

    /**
     * Get list of Y points for each block the pattern contains.
     * @param blockNumber   block number to query.
     * @return              list of keypoints.
     * @throws Exception    if list cannot be provided.
     */
    ArrayList<Double> getYPoints(int blockNumber) throws Exception;

    /**
     * Get list of X construction points for each block the pattern contains.
     * @param blockNumber   block number to query.
     * @return              list of keypoints.
     * @throws Exception    if list cannot be provided.
     */
    ArrayList<Double> getXCtPoints(int blockNumber) throws Exception;

    /**
     * Get list of Y construction points for each block the pattern contains.
     * @param blockNumber   block number to query.
     * @return              list of keypoints.
     * @throws Exception    if list cannot be provided.
     */
    ArrayList<Double> getYCtPoints(int blockNumber) throws Exception;

    /**
     * Get number of blocks in the pattern.
     * @return  number of blocks.
     */
    int getNumberOfBlocksToPlot();

    /**
     * Write all blocks to DXF files showing the information indicated by the dxfLayerChooser array.
     * @param fileOutput        output file path.
     * @param dxfLayerChooser   array of flags indicating content to write to drawing.
     */
    // TODO: Need to improve this definition as boolean[] should have a defined length if in an interface. Ideally should be its own class.
    void writeToDXF(File fileOutput, boolean[] dxfLayerChooser, String timeStamp);
}
