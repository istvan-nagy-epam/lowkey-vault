package com.github.nagyesta.lowkeyvault.service.key;

import com.github.nagyesta.lowkeyvault.model.v7_2.key.constants.KeyOperation;
import com.github.nagyesta.lowkeyvault.service.common.BaseVaultStub;
import com.github.nagyesta.lowkeyvault.service.key.id.KeyEntityId;
import com.github.nagyesta.lowkeyvault.service.key.id.VersionedKeyEntityId;
import com.github.nagyesta.lowkeyvault.service.key.impl.EcKeyCreationInput;
import com.github.nagyesta.lowkeyvault.service.key.impl.KeyCreationInput;
import com.github.nagyesta.lowkeyvault.service.key.impl.OctKeyCreationInput;
import com.github.nagyesta.lowkeyvault.service.key.impl.RsaKeyCreationInput;

import java.util.List;

public interface KeyVaultStub extends BaseVaultStub<KeyEntityId, VersionedKeyEntityId, ReadOnlyKeyVaultKeyEntity> {

    <E, T extends KeyCreationInput<E>> VersionedKeyEntityId createKeyVersion(String keyName, T input);

    VersionedKeyEntityId createRsaKeyVersion(String keyName, RsaKeyCreationInput input);

    VersionedKeyEntityId createEcKeyVersion(String keyName, EcKeyCreationInput input);

    VersionedKeyEntityId createOctKeyVersion(String keyName, OctKeyCreationInput input);

    void setKeyOperations(VersionedKeyEntityId keyEntityId, List<KeyOperation> keyOperations);

}
