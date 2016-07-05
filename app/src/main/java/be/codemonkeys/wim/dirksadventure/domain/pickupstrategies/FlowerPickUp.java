package be.codemonkeys.wim.dirksadventure.domain.pickupstrategies;

import android.content.Context;
import android.widget.Toast;

import be.codemonkeys.wim.dirksadventure.R;
import be.codemonkeys.wim.dirksadventure.domain.Item;
import be.codemonkeys.wim.dirksadventure.domain.interfaces.PickUpStrategy;

/**
 * Created by Wim on 05/07/2016.
 */
public class FlowerPickUp implements PickUpStrategy {

    @Override
    public void pickUp(Context context, Item item) {
        Toast.makeText(context, R.string.pickup_flower, Toast.LENGTH_SHORT).show();
    }
}
