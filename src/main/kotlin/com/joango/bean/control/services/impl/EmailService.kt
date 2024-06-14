package com.joango.bean.control.services.impl

import com.joango.bean.control.services.NotificationService
import com.joango.bean.control.model.UserEntity
import mu.KotlinLogging

class EmailService: NotificationService {

    private val logger = KotlinLogging.logger {}

    init {
        logger.info { "Using email notification service" }
    }

    override fun sendSingleNotification(user: UserEntity) {
        TODO("Not yet implemented")
    }

    override fun sendBatchNotifications(userList: List<UserEntity>) {
        TODO("Not yet implemented")
    }
}