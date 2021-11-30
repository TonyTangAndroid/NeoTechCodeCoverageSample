#!/usr/bin/env bash
./gradlew clean
./gradlew rootCoverageReport
open ./build/reports/jacoco/index.html
