package uz.gita.rounded_internship.data.remote.model

data class AppData(
    val alt_description: Any,
    val blur_hash: String,
    val color: String,
    val created_at: String,
    val current_user_collections: List<Any>,
    val description: String,
    val downloads: Int,
    val exif: Exif,
    val height: Int,
    val id: String,
    val liked_by_user: Boolean,
    val likes: Int,
    val links: Links,
    val location: Location,
    val meta: Meta,
    val promoted_at: String,
    val public_domain: Boolean,
    val sponsorship: Any,
    val tags: List<Any>,
    val tags_preview: List<Any>,
    val topic_submissions: TopicSubmissions,
    val topics: List<Any>,
    val updated_at: String,
    val urls: Urls,
    val user: User,
    val views: Int,
    val width: Int
)