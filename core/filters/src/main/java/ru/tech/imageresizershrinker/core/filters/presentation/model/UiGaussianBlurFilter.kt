package ru.tech.imageresizershrinker.core.filters.presentation.model


import android.graphics.Bitmap
import ru.tech.imageresizershrinker.core.domain.image.filters.Filter
import ru.tech.imageresizershrinker.core.resources.R


class UiGaussianBlurFilter(
    override val value: Float = 1f,
) : UiFilter<Float>(
    title = R.string.gaussian_blur,
    value = value,
    valueRange = 0f..100f
), Filter.GaussianBlur<Bitmap>