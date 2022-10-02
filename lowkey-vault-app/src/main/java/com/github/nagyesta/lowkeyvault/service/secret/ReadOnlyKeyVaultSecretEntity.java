package com.github.nagyesta.lowkeyvault.service.secret;

import com.github.nagyesta.lowkeyvault.service.common.BaseVaultEntity;
import com.github.nagyesta.lowkeyvault.service.key.ReadOnlyDeletedEntity;
import com.github.nagyesta.lowkeyvault.service.secret.id.VersionedSecretEntityId;

public interface ReadOnlyKeyVaultSecretEntity
        extends BaseVaultEntity<VersionedSecretEntityId>, ReadOnlyDeletedEntity<VersionedSecretEntityId> {

    String getValue();

    String getContentType();

    VersionedSecretEntityId getId();

}
