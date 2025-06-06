/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.linecorp.bot.messaging.client;

import com.linecorp.bot.client.base.ApiAuthenticatedClientBuilder;
import com.linecorp.bot.client.base.Result;
import com.linecorp.bot.client.base.channel.ChannelTokenSupplier;
import com.linecorp.bot.messaging.model.BotInfoResponse;
import com.linecorp.bot.messaging.model.BroadcastRequest;
import com.linecorp.bot.messaging.model.CreateRichMenuAliasRequest;
import com.linecorp.bot.messaging.model.GetAggregationUnitNameListResponse;
import com.linecorp.bot.messaging.model.GetAggregationUnitUsageResponse;
import com.linecorp.bot.messaging.model.GetFollowersResponse;
import com.linecorp.bot.messaging.model.GetJoinedMembershipUsersResponse;
import com.linecorp.bot.messaging.model.GetMembershipSubscriptionResponse;
import com.linecorp.bot.messaging.model.GetWebhookEndpointResponse;
import com.linecorp.bot.messaging.model.GroupMemberCountResponse;
import com.linecorp.bot.messaging.model.GroupSummaryResponse;
import com.linecorp.bot.messaging.model.GroupUserProfileResponse;
import com.linecorp.bot.messaging.model.IssueLinkTokenResponse;
import com.linecorp.bot.messaging.model.MarkMessagesAsReadRequest;
import com.linecorp.bot.messaging.model.MembersIdsResponse;
import com.linecorp.bot.messaging.model.MembershipListResponse;
import com.linecorp.bot.messaging.model.MessageQuotaResponse;
import com.linecorp.bot.messaging.model.MulticastRequest;
import com.linecorp.bot.messaging.model.NarrowcastProgressResponse;
import com.linecorp.bot.messaging.model.NarrowcastRequest;
import com.linecorp.bot.messaging.model.NumberOfMessagesResponse;
import com.linecorp.bot.messaging.model.PnpMessagesRequest;
import com.linecorp.bot.messaging.model.PushMessageRequest;
import com.linecorp.bot.messaging.model.PushMessageResponse;
import com.linecorp.bot.messaging.model.QuotaConsumptionResponse;
import com.linecorp.bot.messaging.model.ReplyMessageRequest;
import com.linecorp.bot.messaging.model.ReplyMessageResponse;
import com.linecorp.bot.messaging.model.RichMenuAliasListResponse;
import com.linecorp.bot.messaging.model.RichMenuAliasResponse;
import com.linecorp.bot.messaging.model.RichMenuBatchProgressResponse;
import com.linecorp.bot.messaging.model.RichMenuBatchRequest;
import com.linecorp.bot.messaging.model.RichMenuBulkLinkRequest;
import com.linecorp.bot.messaging.model.RichMenuBulkUnlinkRequest;
import com.linecorp.bot.messaging.model.RichMenuIdResponse;
import com.linecorp.bot.messaging.model.RichMenuListResponse;
import com.linecorp.bot.messaging.model.RichMenuRequest;
import com.linecorp.bot.messaging.model.RichMenuResponse;
import com.linecorp.bot.messaging.model.RoomMemberCountResponse;
import com.linecorp.bot.messaging.model.RoomUserProfileResponse;
import com.linecorp.bot.messaging.model.SetWebhookEndpointRequest;
import com.linecorp.bot.messaging.model.ShowLoadingAnimationRequest;
import com.linecorp.bot.messaging.model.TestWebhookEndpointRequest;
import com.linecorp.bot.messaging.model.TestWebhookEndpointResponse;
import com.linecorp.bot.messaging.model.UpdateRichMenuAliasRequest;
import com.linecorp.bot.messaging.model.UserProfileResponse;
import com.linecorp.bot.messaging.model.ValidateMessageRequest;
import java.net.URI;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import retrofit2.http.*;

@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public interface MessagingApiClient {

  /**
   * Sends a message to multiple users at any time.
   *
   * @param xLineRetryKey Retry key. Specifies the UUID in hexadecimal format (e.g.,
   *     &#x60;123e4567-e89b-12d3-a456-426614174000&#x60;) generated by any method. The retry key
   *     isn&#39;t generated by LINE. Each developer must generate their own retry key. (optional)
   * @param broadcastRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#send-broadcast-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/broadcast")
  CompletableFuture<Result<Object>> broadcast(
      @Header("X-Line-Retry-Key") UUID xLineRetryKey, @Body BroadcastRequest broadcastRequest);

  /**
   * Cancel default rich menu
   *
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#cancel-default-rich-menu">
   *     Documentation</a>
   */
  @DELETE("/v2/bot/user/all/richmenu")
  CompletableFuture<Result<Void>> cancelDefaultRichMenu();

  /**
   * Create rich menu
   *
   * @param richMenuRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#create-rich-menu">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu")
  CompletableFuture<Result<RichMenuIdResponse>> createRichMenu(
      @Body RichMenuRequest richMenuRequest);

  /**
   * Create rich menu alias
   *
   * @param createRichMenuAliasRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#create-rich-menu-alias">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/alias")
  CompletableFuture<Result<Void>> createRichMenuAlias(
      @Body CreateRichMenuAliasRequest createRichMenuAliasRequest);

  /**
   * Deletes a rich menu.
   *
   * @param richMenuId ID of a rich menu (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#delete-rich-menu">
   *     Documentation</a>
   */
  @DELETE("/v2/bot/richmenu/{richMenuId}")
  CompletableFuture<Result<Void>> deleteRichMenu(@Path("richMenuId") String richMenuId);

  /**
   * Delete rich menu alias
   *
   * @param richMenuAliasId Rich menu alias ID that you want to delete. (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#delete-rich-menu-alias">
   *     Documentation</a>
   */
  @DELETE("/v2/bot/richmenu/alias/{richMenuAliasId}")
  CompletableFuture<Result<Void>> deleteRichMenuAlias(
      @Path("richMenuAliasId") String richMenuAliasId);

  /**
   * Get name list of units used this month
   *
   * @param limit The maximum number of aggregation units you can get per request. (optional)
   * @param start Value of the continuation token found in the next property of the JSON object
   *     returned in the response. If you can&#39;t get all the aggregation units in one request,
   *     include this parameter to get the remaining array. (optional)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-name-list-of-units-used-this-month">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/aggregation/list")
  CompletableFuture<Result<GetAggregationUnitNameListResponse>> getAggregationUnitNameList(
      @Query("limit") String limit, @Query("start") String start);

  /**
   * Get number of units used this month
   *
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-number-of-units-used-this-month">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/aggregation/info")
  CompletableFuture<Result<GetAggregationUnitUsageResponse>> getAggregationUnitUsage();

  /**
   * Get bot info
   *
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-bot-info">
   *     Documentation</a>
   */
  @GET("/v2/bot/info")
  CompletableFuture<Result<BotInfoResponse>> getBotInfo();

  /**
   * Gets the ID of the default rich menu set with the Messaging API.
   *
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-default-rich-menu-id">
   *     Documentation</a>
   */
  @GET("/v2/bot/user/all/richmenu")
  CompletableFuture<Result<RichMenuIdResponse>> getDefaultRichMenuId();

  /**
   * Get a list of users who added your LINE Official Account as a friend
   *
   * @param start Value of the continuation token found in the next property of the JSON object
   *     returned in the response. Include this parameter to get the next array of user IDs.
   *     (optional)
   * @param limit The maximum number of user IDs to retrieve in a single request. (optional, default
   *     to 300)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-follower-ids">
   *     Documentation</a>
   */
  @GET("/v2/bot/followers/ids")
  CompletableFuture<Result<GetFollowersResponse>> getFollowers(
      @Query("start") String start, @Query("limit") Integer limit);

  /**
   * Get number of users in a group chat
   *
   * @param groupId Group ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-members-group-count">
   *     Documentation</a>
   */
  @GET("/v2/bot/group/{groupId}/members/count")
  CompletableFuture<Result<GroupMemberCountResponse>> getGroupMemberCount(
      @Path("groupId") String groupId);

  /**
   * Get group chat member profile
   *
   * @param groupId Group ID (required)
   * @param userId User ID (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-group-member-profile">
   *     Documentation</a>
   */
  @GET("/v2/bot/group/{groupId}/member/{userId}")
  CompletableFuture<Result<GroupUserProfileResponse>> getGroupMemberProfile(
      @Path("groupId") String groupId, @Path("userId") String userId);

  /**
   * Get group chat member user IDs
   *
   * @param groupId Group ID (required)
   * @param start Value of the continuation token found in the &#x60;next&#x60; property of the JSON
   *     object returned in the response. Include this parameter to get the next array of user IDs
   *     for the members of the group. (optional)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-group-member-user-ids">
   *     Documentation</a>
   */
  @GET("/v2/bot/group/{groupId}/members/ids")
  CompletableFuture<Result<MembersIdsResponse>> getGroupMembersIds(
      @Path("groupId") String groupId, @Query("start") String start);

  /**
   * Get group chat summary
   *
   * @param groupId Group ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-group-summary">
   *     Documentation</a>
   */
  @GET("/v2/bot/group/{groupId}/summary")
  CompletableFuture<Result<GroupSummaryResponse>> getGroupSummary(@Path("groupId") String groupId);

  /**
   * Get a list of user IDs who joined the membership.
   *
   * @param membershipId Membership plan ID. (required)
   * @param start A continuation token to get next remaining membership user IDs. Returned only when
   *     there are remaining user IDs that weren&#39;t returned in the userIds property in the
   *     previous request. The continuation token expires in 24 hours (86,400 seconds). (optional)
   * @param limit The max number of items to return for this API call. The value is set to 300 by
   *     default, but the max acceptable value is 1000. (optional, default to 300)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-membership-user-ids">
   *     Documentation</a>
   */
  @GET("/v2/bot/membership/{membershipId}/users/ids")
  CompletableFuture<Result<GetJoinedMembershipUsersResponse>> getJoinedMembershipUsers(
      @Path("membershipId") Integer membershipId,
      @Query("start") String start,
      @Query("limit") Integer limit);

  /**
   * Get a list of memberships.
   *
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-membership-plans">
   *     Documentation</a>
   */
  @GET("/v2/bot/membership/list")
  CompletableFuture<Result<MembershipListResponse>> getMembershipList();

  /**
   * Get a user&#39;s membership subscription.
   *
   * @param userId User ID (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-a-users-membership-subscription-status">
   *     Documentation</a>
   */
  @GET("/v2/bot/membership/subscription/{userId}")
  CompletableFuture<Result<GetMembershipSubscriptionResponse>> getMembershipSubscription(
      @Path("userId") String userId);

  /**
   * Gets the target limit for sending messages in the current month. The total number of the free
   * messages and the additional messages is returned.
   *
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-quota">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/quota")
  CompletableFuture<Result<MessageQuotaResponse>> getMessageQuota();

  /**
   * Gets the number of messages sent in the current month.
   *
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-consumption">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/quota/consumption")
  CompletableFuture<Result<QuotaConsumptionResponse>> getMessageQuotaConsumption();

  /**
   * Gets the status of a narrowcast message.
   *
   * @param requestId The narrowcast message&#39;s request ID. Each Messaging API request has a
   *     request ID. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-narrowcast-progress-status">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/progress/narrowcast")
  CompletableFuture<Result<NarrowcastProgressResponse>> getNarrowcastProgress(
      @Query("requestId") String requestId);

  /**
   * Get number of sent broadcast messages
   *
   * @param date Date the messages were sent Format: yyyyMMdd (e.g. 20191231) Timezone: UTC+9
   *     (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-number-of-broadcast-messages">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/delivery/broadcast")
  CompletableFuture<Result<NumberOfMessagesResponse>> getNumberOfSentBroadcastMessages(
      @Query("date") String date);

  /**
   * Get number of sent multicast messages
   *
   * @param date Date the messages were sent Format: &#x60;yyyyMMdd&#x60; (e.g.
   *     &#x60;20191231&#x60;) Timezone: UTC+9 (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-number-of-multicast-messages">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/delivery/multicast")
  CompletableFuture<Result<NumberOfMessagesResponse>> getNumberOfSentMulticastMessages(
      @Query("date") String date);

  /**
   * Get number of sent push messages
   *
   * @param date Date the messages were sent Format: &#x60;yyyyMMdd&#x60; (e.g.
   *     &#x60;20191231&#x60;) Timezone: UTC+9 (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-number-of-push-messages">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/delivery/push")
  CompletableFuture<Result<NumberOfMessagesResponse>> getNumberOfSentPushMessages(
      @Query("date") String date);

  /**
   * Get number of sent reply messages
   *
   * @param date Date the messages were sent Format: &#x60;yyyyMMdd&#x60; (e.g.
   *     &#x60;20191231&#x60;) Timezone: UTC+9 (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-number-of-reply-messages">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/delivery/reply")
  CompletableFuture<Result<NumberOfMessagesResponse>> getNumberOfSentReplyMessages(
      @Query("date") String date);

  /**
   * Get number of sent LINE notification messages
   *
   * @param date Date the message was sent Format: &#x60;yyyyMMdd&#x60;
   *     (Example:&#x60;20211231&#x60;) Time zone: UTC+9 (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/partner-docs/#get-number-of-sent-line-notification-messages">
   *     Documentation</a>
   */
  @GET("/v2/bot/message/delivery/pnp")
  CompletableFuture<Result<NumberOfMessagesResponse>> getPNPMessageStatistics(
      @Query("date") String date);

  /**
   * Get profile
   *
   * @param userId User ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-profile">
   *     Documentation</a>
   */
  @GET("/v2/bot/profile/{userId}")
  CompletableFuture<Result<UserProfileResponse>> getProfile(@Path("userId") String userId);

  /**
   * Gets a rich menu via a rich menu ID.
   *
   * @param richMenuId ID of a rich menu (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-rich-menu">
   *     Documentation</a>
   */
  @GET("/v2/bot/richmenu/{richMenuId}")
  CompletableFuture<Result<RichMenuResponse>> getRichMenu(@Path("richMenuId") String richMenuId);

  /**
   * Get rich menu alias information
   *
   * @param richMenuAliasId The rich menu alias ID whose information you want to obtain. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-rich-menu-alias-by-id">
   *     Documentation</a>
   */
  @GET("/v2/bot/richmenu/alias/{richMenuAliasId}")
  CompletableFuture<Result<RichMenuAliasResponse>> getRichMenuAlias(
      @Path("richMenuAliasId") String richMenuAliasId);

  /**
   * Get list of rich menu alias
   *
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-rich-menu-alias-list">
   *     Documentation</a>
   */
  @GET("/v2/bot/richmenu/alias/list")
  CompletableFuture<Result<RichMenuAliasListResponse>> getRichMenuAliasList();

  /**
   * Get the status of Replace or unlink a linked rich menus in batches.
   *
   * @param requestId A request ID used to batch control the rich menu linked to the user. Each
   *     Messaging API request has a request ID. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-batch-control-rich-menus-progress-status">
   *     Documentation</a>
   */
  @GET("/v2/bot/richmenu/progress/batch")
  CompletableFuture<Result<RichMenuBatchProgressResponse>> getRichMenuBatchProgress(
      @Query("requestId") String requestId);

  /**
   * Get rich menu ID of user
   *
   * @param userId User ID. Found in the &#x60;source&#x60; object of webhook event objects. Do not
   *     use the LINE ID used in LINE. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-rich-menu-id-of-user">
   *     Documentation</a>
   */
  @GET("/v2/bot/user/{userId}/richmenu")
  CompletableFuture<Result<RichMenuIdResponse>> getRichMenuIdOfUser(@Path("userId") String userId);

  /**
   * Get rich menu list
   *
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-rich-menu-list">
   *     Documentation</a>
   */
  @GET("/v2/bot/richmenu/list")
  CompletableFuture<Result<RichMenuListResponse>> getRichMenuList();

  /**
   * Get number of users in a multi-person chat
   *
   * @param roomId Room ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-members-room-count">
   *     Documentation</a>
   */
  @GET("/v2/bot/room/{roomId}/members/count")
  CompletableFuture<Result<RoomMemberCountResponse>> getRoomMemberCount(
      @Path("roomId") String roomId);

  /**
   * Get multi-person chat member profile
   *
   * @param roomId Room ID (required)
   * @param userId User ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-room-member-profile">
   *     Documentation</a>
   */
  @GET("/v2/bot/room/{roomId}/member/{userId}")
  CompletableFuture<Result<RoomUserProfileResponse>> getRoomMemberProfile(
      @Path("roomId") String roomId, @Path("userId") String userId);

  /**
   * Get multi-person chat member user IDs
   *
   * @param roomId Room ID (required)
   * @param start Value of the continuation token found in the &#x60;next&#x60; property of the JSON
   *     object returned in the response. Include this parameter to get the next array of user IDs
   *     for the members of the group. (optional)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-room-member-user-ids">
   *     Documentation</a>
   */
  @GET("/v2/bot/room/{roomId}/members/ids")
  CompletableFuture<Result<MembersIdsResponse>> getRoomMembersIds(
      @Path("roomId") String roomId, @Query("start") String start);

  /**
   * Get webhook endpoint information
   *
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-webhook-endpoint-information">
   *     Documentation</a>
   */
  @GET("/v2/bot/channel/webhook/endpoint")
  CompletableFuture<Result<GetWebhookEndpointResponse>> getWebhookEndpoint();

  /**
   * Issue link token
   *
   * @param userId User ID for the LINE account to be linked. Found in the &#x60;source&#x60; object
   *     of account link event objects. Do not use the LINE ID used in LINE. (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#issue-link-token">
   *     Documentation</a>
   */
  @POST("/v2/bot/user/{userId}/linkToken")
  CompletableFuture<Result<IssueLinkTokenResponse>> issueLinkToken(@Path("userId") String userId);

  /**
   * Leave group chat
   *
   * @param groupId Group ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#leave-group">
   *     Documentation</a>
   */
  @POST("/v2/bot/group/{groupId}/leave")
  CompletableFuture<Result<Void>> leaveGroup(@Path("groupId") String groupId);

  /**
   * Leave multi-person chat
   *
   * @param roomId Room ID (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#leave-room">
   *     Documentation</a>
   */
  @POST("/v2/bot/room/{roomId}/leave")
  CompletableFuture<Result<Void>> leaveRoom(@Path("roomId") String roomId);

  /**
   * Link rich menu to user.
   *
   * @param userId User ID. Found in the &#x60;source&#x60; object of webhook event objects. Do not
   *     use the LINE ID used in LINE. (required)
   * @param richMenuId ID of a rich menu (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#link-rich-menu-to-user">
   *     Documentation</a>
   */
  @POST("/v2/bot/user/{userId}/richmenu/{richMenuId}")
  CompletableFuture<Result<Void>> linkRichMenuIdToUser(
      @Path("userId") String userId, @Path("richMenuId") String richMenuId);

  /**
   * Link rich menu to multiple users
   *
   * @param richMenuBulkLinkRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#link-rich-menu-to-users">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/bulk/link")
  CompletableFuture<Result<Void>> linkRichMenuIdToUsers(
      @Body RichMenuBulkLinkRequest richMenuBulkLinkRequest);

  /**
   * Mark messages from users as read
   *
   * @param markMessagesAsReadRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/partner-docs/#mark-messages-from-users-as-read">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/markAsRead")
  CompletableFuture<Result<Void>> markMessagesAsRead(
      @Body MarkMessagesAsReadRequest markMessagesAsReadRequest);

  /**
   * An API that efficiently sends the same message to multiple user IDs. You can&#39;t send
   * messages to group chats or multi-person chats.
   *
   * @param xLineRetryKey Retry key. Specifies the UUID in hexadecimal format (e.g.,
   *     &#x60;123e4567-e89b-12d3-a456-426614174000&#x60;) generated by any method. The retry key
   *     isn&#39;t generated by LINE. Each developer must generate their own retry key. (optional)
   * @param multicastRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#send-multicast-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/multicast")
  CompletableFuture<Result<Object>> multicast(
      @Header("X-Line-Retry-Key") UUID xLineRetryKey, @Body MulticastRequest multicastRequest);

  /**
   * Send narrowcast message
   *
   * @param xLineRetryKey Retry key. Specifies the UUID in hexadecimal format (e.g.,
   *     &#x60;123e4567-e89b-12d3-a456-426614174000&#x60;) generated by any method. The retry key
   *     isn&#39;t generated by LINE. Each developer must generate their own retry key. (optional)
   * @param narrowcastRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#send-narrowcast-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/narrowcast")
  CompletableFuture<Result<Object>> narrowcast(
      @Header("X-Line-Retry-Key") UUID xLineRetryKey, @Body NarrowcastRequest narrowcastRequest);

  /**
   * Sends a message to a user, group chat, or multi-person chat at any time.
   *
   * @param xLineRetryKey Retry key. Specifies the UUID in hexadecimal format (e.g.,
   *     &#x60;123e4567-e89b-12d3-a456-426614174000&#x60;) generated by any method. The retry key
   *     isn&#39;t generated by LINE. Each developer must generate their own retry key. (optional)
   * @param pushMessageRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#send-push-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/push")
  CompletableFuture<Result<PushMessageResponse>> pushMessage(
      @Header("X-Line-Retry-Key") UUID xLineRetryKey, @Body PushMessageRequest pushMessageRequest);

  /**
   * Send LINE notification message
   *
   * @param xLineDeliveryTag String returned in the delivery.data property of the delivery
   *     completion event via Webhook. (optional)
   * @param pnpMessagesRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/partner-docs/#send-line-notification-message">
   *     Documentation</a>
   */
  @POST("/bot/pnp/push")
  CompletableFuture<Result<Void>> pushMessagesByPhone(
      @Header("X-Line-Delivery-Tag") String xLineDeliveryTag,
      @Body PnpMessagesRequest pnpMessagesRequest);

  /**
   * Send reply message
   *
   * @param replyMessageRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#send-reply-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/reply")
  CompletableFuture<Result<ReplyMessageResponse>> replyMessage(
      @Body ReplyMessageRequest replyMessageRequest);

  /**
   * You can use this endpoint to batch control the rich menu linked to the users using the endpoint
   * such as Link rich menu to user. The following operations are available: 1. Replace a rich menu
   * with another rich menu for all users linked to a specific rich menu 2. Unlink a rich menu for
   * all users linked to a specific rich menu 3. Unlink a rich menu for all users linked the rich
   * menu
   *
   * @param richMenuBatchRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#batch-control-rich-menus-of-users">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/batch")
  CompletableFuture<Result<Void>> richMenuBatch(@Body RichMenuBatchRequest richMenuBatchRequest);

  /**
   * Set default rich menu
   *
   * @param richMenuId ID of a rich menu (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#set-default-rich-menu">
   *     Documentation</a>
   */
  @POST("/v2/bot/user/all/richmenu/{richMenuId}")
  CompletableFuture<Result<Void>> setDefaultRichMenu(@Path("richMenuId") String richMenuId);

  /**
   * Set webhook endpoint URL
   *
   * @param setWebhookEndpointRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#set-webhook-endpoint-url">
   *     Documentation</a>
   */
  @PUT("/v2/bot/channel/webhook/endpoint")
  CompletableFuture<Result<Void>> setWebhookEndpoint(
      @Body SetWebhookEndpointRequest setWebhookEndpointRequest);

  /**
   * Display a loading animation in one-on-one chats between users and LINE Official Accounts.
   *
   * @param showLoadingAnimationRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#display-a-loading-indicator">
   *     Documentation</a>
   */
  @POST("/v2/bot/chat/loading/start")
  CompletableFuture<Result<Object>> showLoadingAnimation(
      @Body ShowLoadingAnimationRequest showLoadingAnimationRequest);

  /**
   * Test webhook endpoint
   *
   * @param testWebhookEndpointRequest (optional)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#test-webhook-endpoint">
   *     Documentation</a>
   */
  @POST("/v2/bot/channel/webhook/test")
  CompletableFuture<Result<TestWebhookEndpointResponse>> testWebhookEndpoint(
      @Body TestWebhookEndpointRequest testWebhookEndpointRequest);

  /**
   * Unlink rich menu from user
   *
   * @param userId User ID. Found in the &#x60;source&#x60; object of webhook event objects. Do not
   *     use the LINE ID used in LINE. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#unlink-rich-menu-from-user">
   *     Documentation</a>
   */
  @DELETE("/v2/bot/user/{userId}/richmenu")
  CompletableFuture<Result<Void>> unlinkRichMenuIdFromUser(@Path("userId") String userId);

  /**
   * Unlink rich menus from multiple users
   *
   * @param richMenuBulkUnlinkRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#unlink-rich-menu-from-users">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/bulk/unlink")
  CompletableFuture<Result<Void>> unlinkRichMenuIdFromUsers(
      @Body RichMenuBulkUnlinkRequest richMenuBulkUnlinkRequest);

  /**
   * Update rich menu alias
   *
   * @param richMenuAliasId The rich menu alias ID you want to update. (required)
   * @param updateRichMenuAliasRequest (required)
   * @see <a href="https://developers.line.biz/en/reference/messaging-api/#update-rich-menu-alias">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/alias/{richMenuAliasId}")
  CompletableFuture<Result<Void>> updateRichMenuAlias(
      @Path("richMenuAliasId") String richMenuAliasId,
      @Body UpdateRichMenuAliasRequest updateRichMenuAliasRequest);

  /**
   * Validate message objects of a broadcast message
   *
   * @param validateMessageRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-message-objects-of-broadcast-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/validate/broadcast")
  CompletableFuture<Result<Void>> validateBroadcast(
      @Body ValidateMessageRequest validateMessageRequest);

  /**
   * Validate message objects of a multicast message
   *
   * @param validateMessageRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-message-objects-of-multicast-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/validate/multicast")
  CompletableFuture<Result<Void>> validateMulticast(
      @Body ValidateMessageRequest validateMessageRequest);

  /**
   * Validate message objects of a narrowcast message
   *
   * @param validateMessageRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-message-objects-of-narrowcast-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/validate/narrowcast")
  CompletableFuture<Result<Void>> validateNarrowcast(
      @Body ValidateMessageRequest validateMessageRequest);

  /**
   * Validate message objects of a push message
   *
   * @param validateMessageRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-message-objects-of-push-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/validate/push")
  CompletableFuture<Result<Void>> validatePush(@Body ValidateMessageRequest validateMessageRequest);

  /**
   * Validate message objects of a reply message
   *
   * @param validateMessageRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-message-objects-of-reply-message">
   *     Documentation</a>
   */
  @POST("/v2/bot/message/validate/reply")
  CompletableFuture<Result<Void>> validateReply(
      @Body ValidateMessageRequest validateMessageRequest);

  /**
   * Validate a request body of the Replace or unlink the linked rich menus in batches endpoint.
   *
   * @param richMenuBatchRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-batch-control-rich-menus-request">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/validate/batch")
  CompletableFuture<Result<Void>> validateRichMenuBatchRequest(
      @Body RichMenuBatchRequest richMenuBatchRequest);

  /**
   * Validate rich menu object
   *
   * @param richMenuRequest (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#validate-rich-menu-object">
   *     Documentation</a>
   */
  @POST("/v2/bot/richmenu/validate")
  CompletableFuture<Result<Void>> validateRichMenuObject(@Body RichMenuRequest richMenuRequest);

  public static ApiAuthenticatedClientBuilder<MessagingApiClient> builder(String channelToken) {
    return new ApiAuthenticatedClientBuilder<>(
        URI.create("https://api.line.me"),
        MessagingApiClient.class,
        new MessagingApiExceptionBuilder(),
        channelToken);
  }

  public static ApiAuthenticatedClientBuilder<MessagingApiClient> builder(
      ChannelTokenSupplier channelTokenSupplier) {
    return new ApiAuthenticatedClientBuilder<>(
        URI.create("https://api.line.me"),
        MessagingApiClient.class,
        new MessagingApiExceptionBuilder(),
        channelTokenSupplier);
  }
}
