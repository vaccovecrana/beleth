package io.vacco.beleth.rt.schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BlChangeSet {

  public List<BlResource> toAdd;
  public List<BlResource> toUpdate;
  public List<BlResource> toDelete;

  public BlChangeSet update(Set<BlResource> localResourceSet, Set<BlResource> clusterSet) {
    toAdd = new ArrayList<>(localResourceSet);
    toAdd.removeAll(clusterSet);
    toDelete = new ArrayList<>(clusterSet);
    toDelete.removeAll(localResourceSet);
    toUpdate = new ArrayList<>(localResourceSet);
    toUpdate.retainAll(clusterSet);
    return this;
  }

}
