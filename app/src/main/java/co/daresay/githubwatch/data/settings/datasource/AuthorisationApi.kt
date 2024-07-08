package co.daresay.githubwatch.data.settings.datasource

import co.daresay.githubwatch.data.settings.models.AccessTokenModel
import co.daresay.githubwatch.data.settings.models.InstallationModel
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface AuthorisationApi {

    @GET("users/kiolk/installation")
    suspend fun getAvailableInstallations(): InstallationModel

    @POST("app/installations/{installationId}/access_tokens")
    suspend fun getAccessToken(@Path("installationId") installationId: Long): AccessTokenModel
}
