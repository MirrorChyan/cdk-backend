package model.entity

import org.ktorm.schema.Table
import org.ktorm.schema.datetime
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object CDK : Table<Nothing>("mwf_cdk") {
    val key = varchar("key").primaryKey()
    val specificationId = varchar("specification_id")
    val type = varchar("type")
    val status = int("status")
    val expireTime = datetime("expire_time")
    val createdAt = datetime("created_at")
}

object OperationLog : Table<Nothing>("mwf_operation_log") {
    val id = int("id").primaryKey()
    val cdk = varchar("cdk")
    val source = varchar("source")
    val specificationId = varchar("specification_id")
    val type = varchar("type")
    val createdAt = datetime("created_at")
}
