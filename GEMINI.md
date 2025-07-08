# Gemini Project Configuration (GEMINI.md)

This file helps Gemini understand the project's conventions and requirements.

## Project Overview

This appears to be a Kotlin project for providing Jetpack Compose icons based on the Phosphor icon set. The library module is located in the `lib` directory.

## Build & Test Commands

*   **Build the project:** `./gradlew build`
*   **Run all checks (lint, tests, etc.):** `./gradlew check`
*   **Run ktlint check:** `./gradlew ktlintCheck`
*   **Run detekt check:** `./gradlew detekt`
*   **Run unit tests:** `./gradlew test`

## Instructions for Gemini

*   When adding new icons, follow the existing file structure and naming conventions.
*   Ensure all new code passes `ktlint` and `detekt` checks.
*   Follow the existing coding style and conventions.
*   All commit messages must be in the Conventional Commits format and in lowercase.
