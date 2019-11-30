// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

class MessageOptions(
  unknownFields: ByteString = ByteString.EMPTY
) : Message<MessageOptions, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MessageOptions) return false
    return unknownFields == other.unknownFields
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "MessageOptions{}"

  fun copy(unknownFields: ByteString = this.unknownFields): MessageOptions =
      MessageOptions(unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<MessageOptions> = object : ProtoAdapter<MessageOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageOptions::class
    ) {
      override fun encodedSize(value: MessageOptions): Int = 
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MessageOptions) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MessageOptions {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return MessageOptions(
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MessageOptions): MessageOptions = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
